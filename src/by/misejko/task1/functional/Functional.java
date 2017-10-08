package by.misejko.task1.functional;


import by.misejko.task1.exceptions.Exceptions;
import by.misejko.task1.sphere.Sphere;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.StringTokenizer;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Functional {


    static Logger logger=Logger.getLogger("functional");
    public double area(Sphere s){
        double r=s.getR();
        return 4*Math.PI*Math.pow(r,2);
    }

    public double volume(Sphere s){
        double r=s.getR();
        return 4*Math.PI*Math.pow(r,3)/3;
    }

    public ArrayList<Sphere> read(){
        int i=0;
        ArrayList<Sphere> list=new ArrayList<Sphere>();
        try {

            BufferedReader br = new BufferedReader(new FileReader("src\\by\\misejko\\task1\\file\\input.txt"));
            String str;
            Pattern p= Pattern.compile("-?\\d+\\.\\d+\\s-?\\d+\\.\\d+\\s-?\\d+\\.\\d+\\s\\d+\\.\\d+");
            Matcher m;
            while((str=br.readLine())!=null){
                m=p.matcher(str);
                if(m.matches()){

                    logger.info("String "+i+" is correct");
                    list.add(parse(str));
                }

                else logger.info("String "+i+" is  incorrect");
                i++;
            }
            br.close();
        }catch (Exception e){}
        return list;
    }

    public Sphere parse(String str){
        double m[]=new double[4];
        StringTokenizer st=new StringTokenizer(str);
       for(int i=0;i<4;i++){
           m[i]=Double.parseDouble(st.nextToken());
       }
        return new Sphere(m[0],m[1],m[2],m[3]);
    }

}
