package PracticaTestCoche;

public class Coche {

	public Integer velocidad;

    public void acelerar_Elena(int aceleracion) {
        velocidad += aceleracion;
    }

    public void decelerar_Elena(int deceleracion) {
        velocidad -= deceleracion;
        if(velocidad < 0) velocidad = 0;
    }
}
