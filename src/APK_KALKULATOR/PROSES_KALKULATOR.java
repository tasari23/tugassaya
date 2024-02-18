
package APK_KALKULATOR;


public class PROSES_KALKULATOR {
    int Operator=0;
    double angka1,angka2,angka3,result;
    String Proses;
    
    
    public void setNumber(String opr){
    if(!opr.equals("")){
        if(Operator==0){
            angka1=Double.valueOf(opr);
        }else{
            angka2=Double.valueOf(opr);
        }
    }
}
    
    public void setOperator(int Operator){
        this.Operator=Operator;
    }
    public double getResult(){
        return result;
    }
    public void setResult(double hasil){
        this.result=hasil;
    }
    public void proses(){
        switch(Operator){
            case 1:
                result=angka1 + angka2;
                Proses="+";
                break;
                case 2:
                result=angka1 - angka2;
                Proses="-";
                break;
                case 3:
                result=angka1 * angka2;
                Proses="*";
                break;
                case 4:
                result=angka1 / angka2;
                Proses="/";
                break;
        }
        angka3=angka1;
        angka1=result;
        }
    }
    

