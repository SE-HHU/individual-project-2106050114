package awt;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedWriter;
import java.util.Scanner;
public class sizeyunsuan {



        public static void main(String args[]) throws IOException {

            BufferedWriter ex=new BufferedWriter(new FileWriter("D:\\JAVA\\Exercises.txt"));
            BufferedWriter an=new BufferedWriter(new FileWriter("D:\\JAVA\\Answers.txt"));
            int a,b,c,d,n;
            Scanner in=new Scanner(System.in);
            System.out.println("请输入所需题目个数：");
            n=in.nextInt();
            in.close();
            String exer[]=new String[n+1];
            outer:
            for(int i=1;i<=n;++i) {
                a=(int)(Math.random()*6);
                b=(int)(Math.random()*100);
                c=(int)(Math.random()*100);
                d=(int)(Math.random()*100);
                if(a==0) {
                    String str=i+". "+b+"+"+c+"=";
                    for(int j=1;j<=i;++j) {
                        if(str.equals(exer[j])) {
                            --i;
                            continue outer;
                        }
                    }
                    if(b+c<0||b+c>100) {
                        --i;
                        continue outer;
                    }
                    exer[i]=i+". "+b+"+"+c+"=";
                    ex.write(i+". "+b+"+"+c+"=");
                    ex.newLine();
                    an.write(i+". "+(b+c));
                    an.newLine();
                }
                else if(a==1) {
                    String str=i+". "+b+"-"+c+"=";
                    for(int j=1;j<=i;++j) {
                        if(str.equals(exer[j])) {
                            --i;
                            continue outer;
                        }
                    }
                    if(b-c<0||b-c>100) {
                        --i;
                        continue outer;
                    }
                    exer[i]=i+". "+b+"-"+c+"=";
                    ex.write(i+". "+b+"-"+c+"=");
                    ex.newLine();
                    an.write(i+". "+(b-c));
                    an.newLine();
                }
                else if(a==2) {
                    String str=i+". "+b+"+"+c+"+"+d+"=";
                    for(int j=1;j<=i;++j) {
                        if(str.equals(exer[j])) {
                            --i;
                            continue outer;
                        }
                    }
                    if(b+c+d<0||b+c+d>100) {
                        --i;
                        continue outer;
                    }
                    exer[i]=i+". "+b+"+"+c+"+"+d+"=";
                    ex.write(i+". "+b+"+"+c+"+"+d+"=");
                    ex.newLine();
                    an.write(i+". "+(b+c+d));
                    an.newLine();
                }
                else if(a==3) {
                    String str=i+". "+b+"-"+c+"-"+d+"=";
                    for(int j=1;j<=i;++j) {
                        if(str.equals(exer[j])) {
                            --i;
                            continue outer;
                        }
                    }
                    if(b-c-d<0||b-c-d>100) {
                        --i;
                        continue outer;
                    }
                    exer[i]=i+". "+b+"-"+c+"-"+d+"=";
                    ex.write(i+". "+b+"-"+c+"-"+d+"=");
                    ex.newLine();
                    an.write(i+". "+(b-c-d));
                    an.newLine();
                }
                else if(a==4) {
                    String str=i+". "+b+"+"+c+"-"+d+"=";
                    for(int j=1;j<=i;++j) {
                        if(str.equals(exer[j])) {
                            --i;
                            continue outer;
                        }
                    }
                    if(b+c-d<0||b+c-d>100) {
                        --i;
                        continue outer;
                    }
                    exer[i]=i+". "+b+"+"+c+"-"+d+"=";
                    ex.write(i+". "+b+"+"+c+"-"+d+"=");
                    ex.newLine();
                    an.write(i+". "+(b+c-d));
                    an.newLine();
                }
                else if(a==5) {
                    String str=i+". "+b+"-"+c+"+"+d+"=";
                    for(int j=1;j<=i;++j) {
                        if(str.equals(exer[j])) {
                            --i;
                            continue outer;
                        }
                    }
                    if(b-c+d<0||b-c+d>100) {
                        --i;
                        continue outer;
                    }
                    exer[i]=i+". "+b+"-"+c+"+"+d+"=";
                    ex.write(i+". "+b+"-"+c+"+"+d+"=");
                    ex.newLine();
                    an.write(i+". "+(b-c+d));
                    an.newLine();
                }
            }
            ex.close();
            an.close();
        }
    }

