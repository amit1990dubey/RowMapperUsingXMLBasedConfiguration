package com.ibm.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class Lab58 {

    public static void main(String[] args) {

        ApplicationContext ctx = new ClassPathXmlApplicationContext("ibmindia.xml");

        CustomerDAO cdao = (CustomerDAO) ctx.getBean("cdao");

        //1. getCustomerBycid
        System.out.println("getCustomerByCid");
        CustomerTo cto = cdao.getCustomerByCid(470);
        System.out.println(cto);

        //2.getAllCuctomers

        System.out.println("getallCustomers");
        List<CustomerTo> list = cdao.getAllCustomers();
        for(CustomerTo ct : list)
        {
            System.out.println(ct);
        }

        //3. getCustomerByEmail

        System.out.println("getCustomerByEmail");
        cto = cdao.getCustomerByEmail("amit@ibm.com");
        System.out.println(cto);


        //4. getCustomerByCity
        System.out.println("getCustomerByCity");
        list = (List<CustomerTo>) cdao.getCustomerByCity("Italy");
        for(CustomerTo ct : list)
        {
            System.out.println(ct);
        }

        //5. getCustomerCount
        System.out.println("getCustomerCount");
        int count = cdao.getCustomersCount();
        System.out.println("No of Cust:" +count);


        //6. getCustomerCityByemail

        System.out.println("getCustomerCityByEmail");
        String ci= cdao.getCustomersCityByEmail("s@ibm.com");
        System.out.println(ci);

        //7. GetCustomerPhonByemail

        System.out.println("getCustomerPhoneByEmail");
        long ph = cdao.getCustomerPhoneByEmail("m@gmail.com");
        System.out.println(ph);



    }


}
