package org.example;

import org.example.model.Messenger;
import org.example.model.MobilePhone;
import org.example.model.Telegram;
import org.example.model.WhatsApp;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ClassPathXmlApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("applicationContext.xml");
//        Telegram telegram = applicationContext.getBean("telegram", Telegram.class);
//        System.out.println(telegram);

//        WhatsApp whatsapp = applicationContext.getBean("whatsapp", WhatsApp.class);
//        System.out.println(whatsapp);

        Messenger messenger = applicationContext.getBean("whatsapp", Messenger.class);

        MobilePhone mobilePhone = applicationContext.getBean("mobilePhone", MobilePhone.class);
        System.out.println(mobilePhone);

        applicationContext.close();
    }
}
