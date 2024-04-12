package com.mphasis.day03;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class TextEditorConfig 
{
   @Bean 
   @Scope(value = "prototype")
   public TextEditor textEditor()
   {
      return new TextEditor(spellChecker());
   }

   @Bean 
   public SpellChecker spellChecker()
   {
      return new SpellChecker();
   }
}
