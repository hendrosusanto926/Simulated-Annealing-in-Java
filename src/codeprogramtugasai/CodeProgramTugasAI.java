
public class CodeProgramTugasAI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        sa sa=new sa();
        double t=60;
        int n=1000000;
        double x1=sa.generatetitik();
        double x2=sa.generatetitik();
        double hasil=sa.fungsi(x1, x2);
        while (n>0){
            double y1=sa.generatetitik();
            double y2=sa.generatetitik();
            double sem=sa.fungsi(y1, y2);
            if (sem<hasil){
                x1=y1;
                x2=y2;
                hasil=sem;
            }
            else{
                double deltae=sem-hasil;
                if (Math.exp(-deltae/t)>sa.random()){
                    x1=y1;
                    x2=y2;
                    hasil=sem;
                }
            }
            t=sa.revisi(t);
            n--;
        }
        System.out.println("Nilai X1               : "+x1);
        System.out.println("Nilai X2               : "+x2);
        System.out.println("Temperatur Akhir       : "+t);
        System.out.println("Nilai Minimum          : "+hasil);
    }
    }
    

