package com.smart.resource;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import org.springframework.core.io.*;


public class FileSourceExample {
	
	public static void main(String[] args) {
		try {

			//String filePath = "D:/masterSpring/code/chapter4/src/main/resources/conf/file1.txt";
			String filePath = "D:\\workspace-idea\\spring\\chapter4\\src\\main\\resources\\conf\\file1.txt";
			//①使用系统文件路径方式加载文件
			WritableResource res1 = new PathResource(filePath);
			//②使用类路径方式加载文件
			Resource res2 = new ClassPathResource("conf/file1.txt");

			//使用WritableResource接口写资源文件
			OutputStream stream1 = res1.getOutputStream();
			stream1.write("欢迎光临\n小春论坛".getBytes());
			stream1.close();

			//使用Resource文件读取资源文件
            InputStream ins1 = res1.getInputStream();
			InputStream ins2 = res2.getInputStream();

			ByteArrayOutputStream baos = new ByteArrayOutputStream();

			int i;
			while((i=ins1.read())!=-1){
				baos.write(i);
			}
			/*byte[] b = new byte[1024];
			int len = 0;
			while ((len =ins1.read(b))!= -1 ){
				//baos.write(len);
				baos.write(b,0,len);
			}*/
			System.out.println(baos.toString());

            System.out.println("res1:"+res1.getFilename());
            System.out.println("res2:"+res2.getFilename());            
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
