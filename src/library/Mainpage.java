/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library;

import java.util.Scanner;
import java.io.File;
import java.io.PrintWriter;

/**
 *
 * @author kayva
 */
//public class Mainpage {

  //  private static Scanner x;

    /**
     * @param args the command line arguments
     */
//    public static void main(String[] args, String book) {
//        // TODO code application logic here
//        Scanner s = new Scanner(System.in);
//        String user;
//        String pw;
//        System.out.println("-------------------- Welcome To Library Management System --------------------");
//        System.out.println("Login as :\n1.Head Librarian\n2.Librarian\n3.Member");
//        int as = s.nextInt();
//        if (as == 3) {
//            System.out.println("------------------------------------------------------------------------------");
//            System.out.println("Username : ");
//            user = s.next();
//            System.out.println("Password : ");
//            pw = s.next();
//            String filepath = user + ".txt";
//            if (verifyLoginmember(user, pw, filepath)) {
//                System.out.println("---------------------------------------------------------------------------------\n1.Update Profiles\n2.Search for Books\n3.Renew Membership");
//                int home = s.nextInt();
//                switch (home) {
//                    case 1:
//                        String oldpw;
//                        String newpw;
//                        System.out.println("-------------------- **Update Profile** --------------------");
//                        System.out.println("Enter your old password : ");
//                        oldpw = s.next();
//                        System.out.println("Enter your new password : ");
//                        newpw = s.next();
//                        if (pw.equals(oldpw)) {
//                            Members.UpdateProfile(user, newpw, filepath);
//
//                        } else {
//                            System.out.println("Password Incorrect!");
//                        }
//                        break;
//                    case 2:
//
//                        System.out.println("-------------------- **Books Categories** --------------------");
//                        ShowBookCategories();
//                        System.out.println("Enter category of the book : ");
//                        String categ = s.next();
//                        System.out.println("----------------------------- " + categ + " ------------------------------");
//                        ShowBooks(categ);
//                        System.out.println("Enter title of the book you want to borrow : ");
//                        String buku = s.nextLine();
//                //        Members.BorrowBook(book,categ);
//                        break;
//
//                }
//
//            } else {
//                System.out.println("Username or Password is incorrect!");
//            }
//
//        }
//
//    }
//
//    public static boolean verifyLoginmember(String user, String pw, String filepath) {
//        boolean found = false;
//        String tempPassword = "";
//
//        try {
//            x = new Scanner(new File("Login\\Members\\" + filepath));
//            while (x.hasNext()) {
//                tempPassword = x.next();
//                if (tempPassword.equals(pw)) {
//                    found = true;
//
//                }
//
//            }
//        } catch (Exception e) {
//            System.out.println("Error");
//
//        }
//        return found;
//    }
//
//    public static void ShowBookCategories() {
//        File categories = new File("D:\\Rafi\\COMPUTER SCIENCE\\First Semester\\FUNDAMENTALS OF PROGRAMMING\\FIRST QUIZ PREPARATION\\1\\library\\Books");
//        String[] categ = categories.list();
//        for (String names : categ) {
//            System.out.println("-" + names);
//
//        }
//
//    }
//
//    public static void ShowBooks(String categ) {
//        File books = new File("D:\\Rafi\\COMPUTER SCIENCE\\First Semester\\FUNDAMENTALS OF PROGRAMMING\\FIRST QUIZ PREPARATION\\1\\library\\Books\\" + categ);
//        String[] book = books.list();
//        for (String boo : book) {
//            System.out.println("-" + boo);
//        }
//    }
//
//    
//
//}
