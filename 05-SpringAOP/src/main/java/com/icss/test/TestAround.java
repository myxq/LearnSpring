package com.icss.test;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import java.io.*;
import java.text.SimpleDateFormat;

/**
 * @author 李永庆
 * @since 2020/6/5
 */
@Component
@Aspect
public class TestAround {

    @Around("execution(* com..*.*(..))")
    public void doAround(ProceedingJoinPoint jp){
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        long startTime = System.currentTimeMillis();
        String dateStart = dateFormat.format(startTime);
        Object obj = null;
        MethodSignature signature = (MethodSignature) jp.getSignature();
        String methodName = signature.getDeclaringTypeName() + "." + signature.getName();
        try {

            File file =new File("costTime.txt");
            if(!file.exists()){
                file.createNewFile();
            }

            InputStreamReader reader = new InputStreamReader(new FileInputStream(file));
            BufferedReader br = new BufferedReader(reader);

            FileWriter fileWritter = new FileWriter(file.getName(),true);

            String line = "";
            line = br.readLine();
            if (line == null){
                fileWritter.write("===================================="+"\n");
            }

            fileWritter.write(methodName+"开始于"+dateStart+"\n");
            try {
                obj = jp.proceed();


            } catch (Throwable e){
//                System.out.println("执行异常处理程序");
            }

            long endTime = System.currentTimeMillis();
            String dateEnd = dateFormat.format(startTime);
            fileWritter.write(methodName+"结束于"+dateEnd+"\n");
            fileWritter.write(methodName+"耗时"+(endTime-startTime)+"ms"+"\n");
            br.close();
            reader.close();
            fileWritter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
