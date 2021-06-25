import java.util.Scanner;
import static java.lang.System.*;
public class Orang extends Pemain {
    private String nama;
    
    public Orang(){
        super();
        nama = "";
    }
    public Orang(String nama, Integer nyawa){
        super(nyawa);
        this.nama = nama;
    }
    public String getNama(){
        return this.nama;
    }
    public void setNama(String nama){
        this.nama = nama;
    }
    public Integer getAction(){
        Scanner sc = new Scanner(in);
        out.print("pilih 1 : Gunting, 2 : Kertas, 3 : Batu : 1 : ");
        Integer pilihan = sc.nextInt();
        if (pilihan<=1){
            return 1;
        }
        else if(pilihan==2){
            return 2;
        }
        else{
            return 3;
        }
    }
}
