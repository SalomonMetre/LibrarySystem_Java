/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package librarysystem;

import java.util.Date;

/**
 *
 * @author salom
 */
public class DateUtil {
    
    public static int transformMonth(String month){
        int result;
        switch(month){
        case "Jan":
            result=1;
            break;
        case "Feb":
            result=2;
            break;
        case "Mar":
            result=3;
            break;
        case "Apr":
            result=4;
            break;
        case "May":
            result=5;
            break;
        case "Jun":
            result=6;
            break;
        case "Jul":
            result=7;
            break;
        case "Aug":
            result=8;
            break;
        case "Sep":
            result=9;
            break;
        case "Oct":
            result=10;
            break;
        case "Nov":
            result=11;
            break;
        default:
            result=12;
        }
        return result;
    }
    
    public static String getMonthInRightFormat(int month){
        if(month<=9){
            return "0"+month;
        }
        return ""+month; 
    }
    
    public static String getDate(){
        Date date=new Date();
        return date.toString().substring(24,28)+"-"+getMonthInRightFormat(transformMonth(date.toString().substring(4,7)))+"-"+date.toString().substring(8,10);
    }
    
    public static String getReturnDate(){
        Date date=new Date();
        return date.toString().substring(24,28)+"-"+getMonthInRightFormat(transformMonth(date.toString().substring(4,7))+3)+"-"+date.toString().substring(8,10);
    }
    
    public static void main(String[] args) {
        System.out.println(getDate());
        System.out.println(getReturnDate());
    }
}
