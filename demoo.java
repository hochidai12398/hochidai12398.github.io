/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.QuanLiCovid2021;

import java.util.Scanner;


public class demoo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Citizen people = new Citizen();
        int choose;
        do{
            showMenu();
            System.out.println("Lua chon chuong trinh:");
            choose = Integer.parseInt(scan.nextLine());
            switch(choose){
                case 1:
                    people.input();
                    break;
                case 2:
                    people.patientNameSearch();
                    break;
                case 3:
                    people.cmtndSearch();
                    break;
                case 4:
                    people.healthStatusSet();
                    break;
                case 5:
                    people.movingProcess();
                    break;
                case 6:
                    people.searchRelativePeople();
                    break;
                case 7:
                    people.covidPatient();
                    break;
                case 8:
                    people.watchingPatient();
                    break;
                case 9:
                    System.out.println("Vì VIỆT NAM => chung sức chống COVID-19");
                    break;
                default:
                    System.out.println("Nhập sai chương trình!!");
                    break;
            }
        }while(choose != 9);
    }

    public static void showMenu(){
        System.out.println("1. Lập danh sách tất cả công dân tại Việt Nam");
        System.out.println("2. Tìm kiếm thông tin bệnh nhân theo tên");
        System.out.println("3. Tìm kiếm bệnh nhân theo CMTND");
        System.out.println("4. Thiết lập tình trạng sức khoẻ");
        System.out.println("5. Thiết lập lộ trình di chuyển của 1 bệnh nhân.");
        System.out.println("6. Thiết lập trạng thái bệnh nhân đã tiếp xúc vs một bệnh nhân dương tính COVID-19");
        System.out.println("7. Hiển thị danh sách bệnh nhân dương tính COVID-19");
        System.out.println("8. Hiển thị danh sách bệnh nhân đang theo dõi");
        System.out.println("9. Thoát");
    }
}
