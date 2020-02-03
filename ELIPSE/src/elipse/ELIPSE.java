package elipse;
//IMPORTACION DE TODO LO NECESARIO DE JFREECHART Y JCOMMON
import java.awt.BasicStroke;
import java.awt.Color;
import javax.swing.JFrame;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
//import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.xy.XYLineAndShapeRenderer;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;
import static java.lang.Math.*;
//import java.util.Scanner;
import javax.swing.WindowConstants;

//VARIAVLES DE LA EXCENTRICADAD Y EJE MAYOR
public class ELIPSE {
double e;
double a;
String n;
//IGUALAR
public ELIPSE(double excentricidad,double semiejemayor,String nombre){
   e=excentricidad;
   a=semiejemayor;
   n=nombre;
}
//INCIO DE TODO EL PORGRAMA
    public static void main(String[] args){
    
    //INGRESO DE DATOS DE LA EXCENTRICIDAD Y EL EJE MAYOR
    ELIPSE ceres=new ELIPSE(0.076,2.769,"CERES");
    ELIPSE pluton=new ELIPSE(0.244,39.264,"PLUTON");
    ELIPSE haumea=new ELIPSE(0.1888,43.335,"HAUMEA");
    ELIPSE makemake=new ELIPSE(0.159,45.791,"MAKEMAKE");
    ELIPSE eris=new ELIPSE(0.4417,67.67,"ERIS");    
   //CALCULO DEl NUMERADOR
    double arribaC=ceres.a*(1-ceres.e*ceres.e);
    double arribaP=pluton.a*(1-pluton.e*pluton.e);
    double arribaH=haumea.a*(1-haumea.e*haumea.e);
    double arribaM=makemake.a*(1-makemake.e*makemake.e);
    double arribaE=eris.a*(1-eris.e*eris.e);
    //
    //PLANETAS PERIHELIO Y AFELIO
    //CERES
    double perihelio=ceres.a*(1-ceres.e);
    double afelio=ceres.a*(1+ceres.e);
    System.out.println(ceres.n);
    System.out.println(arribaC+"/"+"1+"+ceres.e+"cos(0)");
    System.out.println("El perihelio es"+"  "+perihelio);
    System.out.println("El afelio es"+"  "+afelio);
    /*2.753006256/1+0.076cos(0)
    El perihelio es  2.5585560000000003
    El afelio es  2.9794440000000004*/
    //PLUTON
    double perihelioa=pluton.a*(1-pluton.e);
    double afelioa=pluton.a*(1+pluton.e);
    System.out.println(pluton.n);
    System.out.println(arribaP+"/"+"1+"+pluton.e+"cos(0)");
    System.out.println("El perihelio es"+"  "+perihelioa);
    System.out.println("El afelio es"+"  "+afelioa);
    /*36.926378496/1+0.244cos(0)
    El perihelio es  29.683584000000003
    El afelio es  48.844416*/
    //HAUMEA
    double periheliob=haumea.a*(1-haumea.e);
    double afeliob=haumea.a*(1+haumea.e);
    System.out.println(haumea.n);
    System.out.println(arribaH+"/"+"1+"+haumea.e+"cos(0)");
    System.out.println("El perihelio es"+"  "+periheliob);
    System.out.println("El afelio es"+"  "+afeliob);
    /*41.7903048576/1+0.1888cos(0)
    El perihelio es  35.153352000000005
    El afelio es  51.516648*/
    //MAKEMAKE
    double perihelioc=makemake.a*(1-makemake.e);
    double afelioc=makemake.a*(1+makemake.e);
    System.out.println(makemake.n);
    System.out.println(arribaM+"/"+"1+"+makemake.e+"cos(0)");
    System.out.println("El perihelio es"+"  "+perihelioc);
    System.out.println("El afelio es"+"  "+afelioc);
    /*44.633357729/1+0.159cos(0)
    El perihelio es  38.510231
    El afelio es  53.071768999999996*/
    //ERIS
    double periheliod=eris.a*(1-eris.e);
    double afeliod=eris.a*(1+eris.e);
    System.out.println(eris.n);
    System.out.println(arribaE+"/"+"1+"+eris.e+"cos(0)");
    System.out.println("El perihelio es"+"  "+periheliod);
    System.out.println("El afelio es"+"  "+afeliod);
    /*54.4676581137/1+0.4417cos(0)
    El perihelio es  37.780161
    El afelio es  97.559839*/
    //VARIABLES DEL ANGULO PARA LA DISTANCIA
    double [] angulo={PI/4,PI/3,2*PI/3,5*PI/4,7*PI/6};
    String [] nombre={"PI/4","PI/3","2PI/3","5PI/4","7PI/6"};
    //COORDENADAS X y Y DEL SOL
    int xu=0;
    int yu=0;
    //CICLO PARA EL CALCULO DE LA DISTANCIA
    //CERES
    for(int i=0;i<angulo.length;i++){
    double cos=Math.cos(angulo[i]);
    double radio=arribaC/(1+ceres.e*cos);
    double xd=radio*cos;
    double yd=radio*java.lang.Math.sin(angulo[i]);
    double distancia=Math.sqrt((xd-xu)*(xd-xu)+(yd-yu)*(yd-yu));
    System.out.println("La distancia de "+ceres.n+ " en el angulo "+nombre[i]+" es de "+distancia+"ua");
    }/*La distancia de CERES en el angulo PI/4 es de 2.612604584226987ua
    La distancia de CERES en el angulo PI/3 es de 2.6522218265895954ua
    La distancia de CERES en el angulo 2PI/3 es de 2.8617528648648647ua
    La distancia de CERES en el angulo 5PI/4 es de 2.909355348057451ua
    La distancia de CERES en el angulo 7PI/6 es de 2.9469697036963978ua*/
    //PLUTON
    for(int i=0;i<angulo.length;i++){
    double cos=Math.cos(angulo[i]);
    double radio=arribaP/(1+pluton.e*cos);
    double xd=radio*cos;
    double yd=radio*java.lang.Math.sin(angulo[i]);
    double distancia=Math.sqrt((xd-xu)*(xd-xu)+(yd-yu)*(yd-yu));
    System.out.println("La distancia de "+pluton.n+ " en el angulo "+nombre[i]+" es de "+distancia+"ua");
    }
    /*La distancia de PLUTON en el angulo PI/4 es de 31.492798312196896ua
    La distancia de PLUTON en el angulo PI/3 es de 32.91121078074866ua
    La distancia de PLUTON en el angulo 2PI/3 es de 42.057378697038715ua
    La distancia de PLUTON en el angulo 5PI/4 es de 44.625858866704654ua
    La distancia de PLUTON en el angulo 7PI/6 es de 46.81990109022061ua*/
    //HAUMEA
    for(int i=0;i<angulo.length;i++){
    double cos=Math.cos(angulo[i]);
    double radio=arribaH/(1+haumea.e*cos);
    double xd=radio*cos;
    double yd=radio*java.lang.Math.sin(angulo[i]);
    double distancia=Math.sqrt((xd-xu)*(xd-xu)+(yd-yu)*(yd-yu));
    System.out.println("La distancia de "+haumea.n+ " en el angulo "+nombre[i]+" es de "+distancia+"ua");
    }/*La distancia de HAUMEA en el angulo PI/4 es de 36.86831932839802ua
    La distancia de HAUMEA en el angulo PI/3 es de 38.18558557894737ua
    La distancia de HAUMEA en el angulo 2PI/3 es de 46.14653804946995ua
    La distancia de HAUMEA en el angulo 5PI/4 es de 48.22895528499968ua
    La distancia de HAUMEA en el angulo 7PI/6 es de 49.958857667762054ua*/
    //MAKEMAKE
    for(int i=0;i<angulo.length;i++){
    double cos=Math.cos(angulo[i]);
    double radio=arribaM/(1+makemake.e*cos);
    double xd=radio*cos;
    double yd=radio*java.lang.Math.sin(angulo[i]);
    double distancia=Math.sqrt((xd-xu)*(xd-xu)+(yd-yu)*(yd-yu));
    System.out.println("La distancia de "+makemake.n+ " en el angulo "+nombre[i]+" es de "+distancia+"ua");
    }/*La distancia de MAKEMAKE en el angulo PI/4 es de 40.12239745720698ua
    La distancia de MAKEMAKE en el angulo PI/3 es de 41.346324899490504ua
    La distancia de MAKEMAKE en el angulo 2PI/3 es de 48.48816700597501ua
    La distancia de MAKEMAKE en el angulo 5PI/4 es de 50.287139755935755ua
    La distancia de MAKEMAKE en el angulo 7PI/6 es de 51.760705365532ua*/
    //ERIS
    for(int i=0;i<angulo.length;i++){
    double cos=Math.cos(angulo[i]);
    double radio=arribaM/(1+makemake.e*cos);
    double xd=radio*cos;
    double yd=radio*java.lang.Math.sin(angulo[i]);
    double distancia=Math.sqrt((xd-xu)*(xd-xu)+(yd-yu)*(yd-yu));
    System.out.println("La distancia de "+eris.n+ " en el angulo "+nombre[i]+" es de "+distancia+"ua");
    }
    /*La distancia de ERIS en el angulo PI/4 es de 40.12239745720698ua
    La distancia de ERIS en el angulo PI/3 es de 41.346324899490504ua
    La distancia de ERIS en el angulo 2PI/3 es de 48.48816700597501ua
    La distancia de ERIS en el angulo 5PI/4 es de 50.287139755935755ua
    La distancia de ERIS en el angulo 7PI/6 es de 51.760705365532ua*/
    //BUCLE PARA PLOTEAR LOS PUNTOS DE LAS ORBITAS DE LOS PLANETAS
    //CERES
    XYSeries aceres = new XYSeries(ceres.n);XYSeries bceres = new XYSeries(".");
    for(int i=0;i<=360;i++)
    {  
        double cos=Math.cos(i*PI/180);
        double sen=java.lang.Math.sin(i*PI/180);
        double r= arribaC/(1+ceres.e*cos);
        double x=r*cos;
        double y=r*sen;
        if(i<=180){
        aceres.add(x,y);
        }else{
        bceres.add(x,y);
        }
    }
    //PLUTON
    XYSeries apluton = new XYSeries(pluton.n);XYSeries bpluton = new XYSeries("..");
    for(int i=0;i<=360;i++)
    {  
        double cos=Math.cos(i*PI/180);
        double sen=java.lang.Math.sin(i*PI/180);
        double r= arribaP/(1+pluton.e*cos);
        double x=r*cos;
        double y=r*sen;
        if(i<=180){
        apluton.add(x,y);
        }else{
        bpluton.add(x,y);
        }
    }
    //HAUMEA
     XYSeries ahaumea = new XYSeries(haumea.n);XYSeries bhaumea = new XYSeries("|");
      for(int i=0;i<=360;i++)
    {  
        double cos=Math.cos(i*PI/180);
        double sen=java.lang.Math.sin(i*PI/180);
        double r= arribaH/(1+haumea.e*cos);
        double x=r*cos;
        double y=r*sen;
        if(i<=180){
        ahaumea.add(x,y);
        }else{
        bhaumea.add(x,y);
        }
    }
    //MAKEMAKE
     XYSeries amakemake = new XYSeries(makemake.n);XYSeries bmakemake = new XYSeries("||");
     for(int i=0;i<=360;i++)
    {  
        double cos=Math.cos(i*PI/180);
        double sen=java.lang.Math.sin(i*PI/180);
        double r= arribaM/(1+makemake.e*cos);
        double x=r*cos;
        double y=r*sen;
        if(i<=180){
        amakemake.add(x,y);
        }else{
        bmakemake.add(x,y);
        }
    }
    //ERIS
     XYSeries aeris = new XYSeries(eris.n);XYSeries beris = new XYSeries("-");
     for(int i=0;i<=360;i++)
    {  
        double cos=Math.cos(i*PI/180);
        double sen=java.lang.Math.sin(i*PI/180);
        double r= arribaE/(1+eris.e*cos);
        double x=r*cos;
        double y=r*sen;
        if(i<=180){
        aeris.add(x,y);
        }else{
        beris.add(x,y);
        }
    }
    //INGRESO PARA PLOTEAR LOS PUNTOS
    XYSeriesCollection dataset = new XYSeriesCollection();
    dataset.addSeries(aceres);dataset.addSeries(bceres);
    dataset.addSeries(apluton);dataset.addSeries(bpluton);
    dataset.addSeries(ahaumea);dataset.addSeries(bhaumea);
    dataset.addSeries(amakemake);dataset.addSeries(bmakemake);
    dataset.addSeries(aeris);dataset.addSeries(beris);
    //NOMBRE DE LA GRAFICA, EN LOS EJES X y Y        
    JFreeChart xylineChart = ChartFactory.createScatterPlot( "Grafica","","",dataset);
    //
    XYPlot plot = xylineChart.getXYPlot();
    //EDITAR EL COLOR DE LAS GRAFICAS
    XYLineAndShapeRenderer renderer = new XYLineAndShapeRenderer();
        renderer.setSeriesPaint(0, Color.RED);
        renderer.setSeriesStroke(0, new BasicStroke(8f));
        renderer.setSeriesPaint(1, Color.RED);
        renderer.setSeriesStroke(1, new BasicStroke(8f));
    //
        renderer.setSeriesPaint(2, Color.BLUE);
        renderer.setSeriesStroke(2, new BasicStroke(8f));
        renderer.setSeriesPaint(3, Color.BLUE);
        renderer.setSeriesStroke(3, new BasicStroke(8f));
    //
        renderer.setSeriesPaint(4, Color.YELLOW);
        renderer.setSeriesStroke(4, new BasicStroke(8f));
        renderer.setSeriesPaint(5, Color.YELLOW);
        renderer.setSeriesStroke(5, new BasicStroke(8f));
    //
        renderer.setSeriesPaint(6, Color.ORANGE);
        renderer.setSeriesStroke(6, new BasicStroke(8f));
        renderer.setSeriesPaint(7, Color.ORANGE);
        renderer.setSeriesStroke(7, new BasicStroke(8f));
    //
        renderer.setSeriesPaint(8, Color.BLACK);
        renderer.setSeriesStroke(8, new BasicStroke(8f));
        renderer.setSeriesPaint(9, Color.BLACK);
        renderer.setSeriesStroke(9, new BasicStroke(8f));
    //
    plot.setRenderer(renderer);         
    ChartPanel panel = new ChartPanel(xylineChart);
    //CREA LA VENTANA PARA PLOTEAR LAS ELIPSES
    JFrame ventana = new JFrame("Grafica");
    ventana.setVisible(true);
    ventana.setSize(1080, 1080);
    ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    ventana.add(panel);  
    ventana.setLocationRelativeTo(null);  
    ventana.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		}
        }