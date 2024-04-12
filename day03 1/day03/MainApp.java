package com.mphasis.day03;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp 
{
	   public static void main(String[] args) 
	   {
	      ApplicationContext ctx =  new AnnotationConfigApplicationContext(TextEditorConfig.class);

	      TextEditor te = ctx.getBean(TextEditor.class);
	      te.spellCheck();
	      System.out.println(te.hashCode());
	      
	      TextEditor te1 = ctx.getBean(TextEditor.class);
	      te1.spellCheck();
	      System.out.println(te1.hashCode());
	   }
}