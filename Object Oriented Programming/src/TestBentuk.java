import java.util.Random;
import java.util.Scanner;
import java.text.DecimalFormat;

abstract class Bentuk {
	abstract double hitungLuas();

	abstract double hitungKeliling();
}

class SegiEmpat extends Bentuk {
	private int sisi;
	DecimalFormat df = new DecimalFormat("#.##");

	public double getSisi() {
		return sisi;
	}

	public void setSisi(int sisi) {
		this.sisi = sisi;
	}

	double hitungLuas() {
		return Double.parseDouble(df.format(sisi * sisi));
	}

	double hitungKeliling() {
		return Double.parseDouble(df.format(sisi * 4));
	}
}

class Lingkaran extends Bentuk {
	private int radius;
	DecimalFormat df = new DecimalFormat("#.##");

	public double getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	double hitungLuas() {
		return Double.parseDouble(df.format(Math.PI * radius * radius));
	}

	double hitungKeliling() {
		return Double.parseDouble(df.format(2 * Math.PI * radius));
	}
}

public class TestBentuk {
	private static int choice;
    private static SegiEmpat segiEmpat;
    private static Lingkaran lingkaran;

	public static void main(String[] args) {
        segiEmpat = new SegiEmpat();
        lingkaran = new Lingkaran();

		Thread thread1 = new Thread(new Runnable() {

			public void run() {
				Scanner input = new Scanner(System.in);
				
					System.out.print("Masukan menu [0=Exit; 1=Segiempat; 2=Lingkaran]: ");
					choice = input.nextInt();
					
				    if(choice == 0){
				        System.exit(0);
				    }
			}
		});
		thread1.start();
		
	    try {
	        thread1.join();
	      } catch (InterruptedException e) {
	        e.printStackTrace();
	    }

		Thread thread2 = new Thread(new Runnable() {
			public void run() {
				Random random = new Random();

				if (choice == 1) {
		            segiEmpat.setSisi(random.nextInt(99) + 1);
					System.out.println("Berapa luas dan keliling segiempat dengan sisi " +segiEmpat.getSisi() + "?");
				} else {
					lingkaran.setRadius(random.nextInt(99) + 1);
					System.out.println("Berapa luas dan keliling lingkaran dengan radius " +lingkaran.getRadius() + "?");
				}
			}
		});
		thread2.start();
	    
	    Thread thread3 = new Thread(new Runnable() {
	        public void run() {
	            if (choice == 1) {
	                System.out.print("Luas=" + segiEmpat.hitungLuas());
	                System.out.println(" dan keliling=" + segiEmpat.hitungKeliling());
	            } else {
	                System.out.print("Luas=" + lingkaran.hitungLuas());
	                System.out.println(" dan keliling=" + lingkaran.hitungKeliling());
	            }
	        }
	    });
	    thread3.start();
	}
}
