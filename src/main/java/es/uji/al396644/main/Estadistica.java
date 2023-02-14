package es.uji.al396644.main;

public class Estadistica {

    public Estadistica() {
        super();
    }

    public float media(int[] vector) {
        if (vector.length==0)
            return 0;
        float media = 0;
        for (int n : vector)
            media += n;
        return media / vector.length;
    }

    public float varianza(int[] vector) {
        if (vector.length==0)
            return 0;
        float varianza = 0;
        float media = media(vector);
        for (int n : vector)
            varianza += Math.pow((n - media), 2);
        return varianza / vector.length;
    }

    public float desviacion(int[] vector) {
        if (vector.length==0)
            return 0;
        float varianza = varianza(vector);
        return (float) Math.sqrt(varianza);
    }
}
