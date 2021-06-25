import java.util.Scanner;
import static java.lang.System.*;
public class Director {
    public Director(){
        out.println("Welcome to Suit");
        Scanner sc = new Scanner(in);
        out.print("Nama anda : ");
        String nama = sc.next();
        Pemain orang1 = new Orang(nama, 5);
        Pemain komputer1 = new Komputer(10);
        while(true){
            if(orang1.getNyawa()!=0 && komputer1.getNyawa()!=0){
                Integer o = orang1.getAction();
                Integer k = komputer1.getAction();
                /*
                1. Gunting
                2. Kertas
                3. Batu
                */
                if ((o==1 && k==1)|| (o==2 && k==2)|| (o==3 && k==3)){
                    out.println("Imbang");
                }
                else if(o==1 && k==2){
                    out.println("orang pilih gunting, komputer pilih kertas");
                    out.println("Orang Menang");
                    komputer1.setNyawa(komputer1.getNyawa()-1);
                    out.println("nyawa orang " + orang1.getNyawa() + " nyawa komputer " + komputer1.getNyawa());
                }
                else if(o==2 && k==1){
                    out.println("orang pilih kertas, komputer pilih gunting");
                    out.println("Orang kalah");
                    orang1.setNyawa(orang1.getNyawa()-1);
                    out.println("nyawa orang " + orang1.getNyawa() + " nyawa komputer " + komputer1.getNyawa());
                }
                else if(o==1 && k==3){
                    out.println("orang pilih gunting, komputer pilih batu");
                    out.println("Orang kalah");
                    orang1.setNyawa(orang1.getNyawa()-1);
                    out.println("nyawa orang " + orang1.getNyawa() + " nyawa komputer " + komputer1.getNyawa());
                }
                else if(o==3 && k==1){
                    out.println("orang pilih batu, komputer pilih gunting");
                    out.println("Orang menang");
                    komputer1.setNyawa(komputer1.getNyawa()-1);
                    out.println("nyawa orang " + orang1.getNyawa() + " nyawa komputer " + komputer1.getNyawa());
                }
                else if(o==2 && k==3){
                    out.println("orang pilih kertas, komputer pilih batu");
                    out.println("Orang menang");
                    komputer1.setNyawa(komputer1.getNyawa()-1);
                    out.println("nyawa orang " + orang1.getNyawa() + " nyawa komputer " + komputer1.getNyawa());
                }
                else if(o==3 && k==2){
                    out.println("orang pilih batu, komputer pilih kertas");
                    out.println("Orang kalah");
                    orang1.setNyawa(orang1.getNyawa()-1);
                    out.println("nyawa orang " + orang1.getNyawa() + " nyawa komputer " + komputer1.getNyawa());
                }
            }
            else if(orang1.getNyawa()==0){
                out.println("Orang Kalah");
                out.println("nyawa orang " + orang1.getNyawa() + " nyawa komputer " + komputer1.getNyawa());
                out.println("Komputer Menang");
                exit(0);
                break;
            }
            else{
                out.println("Komputer Kalah");
                out.println("nyawa orang " + orang1.getNyawa() + " nyawa komputer " + komputer1.getNyawa());
                out.println("Orang Menang");
                exit(0);
                break;
            }
        }
    }
    public static void main(String[] args) {
        new Director();
    }
}
