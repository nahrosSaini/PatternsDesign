package com.Creational.AbstractFactory;

import org.xml.sax.SAXException;

import javax.print.Doc;
import javax.swing.text.Document;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.lang.annotation.Documented;

public class AbstractFactoryDemo {

    public static void main(String args[]) throws ParserConfigurationException, IOException, SAXException {

        String xml="<document><body><stock>AAPL</stock></body></document>";
        ByteArrayInputStream bais=new ByteArrayInputStream(xml.getBytes());

        DocumentBuilderFactory documentBuilderFactory=DocumentBuilderFactory.newInstance();

        DocumentBuilder documentBuilder=documentBuilderFactory.newDocumentBuilder();
        //this is incomplete example
    }
}
