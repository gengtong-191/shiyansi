package jiekou;
import java.util.Scanner;
	public class Test {
	    public static void main(String[] args) {
	        for(int i=0;i<2;i++) {
	            Graduate graduate1 = new Graduate();
	            Graduate graduate2 = new Graduate();
	            System.out.println("�����������Ա�����");
	            Scanner y = new Scanner(System.in);
	            String name = y.nextLine();
	            String sex = y.nextLine();
	            int age = y.nextInt();
	            graduate1.setGraduate(name, sex, age);
	            try {
	                Scanner in = new Scanner(System.in);
	                System.out.println(graduate1);
	                System.out.println("����������¹��ʣ�");
	                double pay = in.nextDouble();
	                graduate1.Teachersgetmoney(pay);
	                System.out.println("���������ѧ�ѣ�");
	                double free = in.nextDouble();
	                graduate1.Studentsgetmoney(free);
	                graduate1.setRatal();
	                System.out.println("\t");
	                graduate2.setGraduate(name, sex, age);
	            }
	            catch (Exception in){
	                System.out.println("���������⣬�ٴ�����");
	                i--;
	            }
	        }
	    }
	}