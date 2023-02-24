package dio_java_boot;

public class Usuario {

	public static void main(String[] args) {
		SmartTv smartTv = new SmartTv();
		
		smartTv.aumentarVolume();
		smartTv.aumentarVolume();
		smartTv.aumentarVolume();
		smartTv.aumentarVolume();
		smartTv.diminuirVolume();
		
		smartTv.aumentarCanal();
		smartTv.aumentarCanal();
		smartTv.diminuirCanal();
		
		System.out.println("TV ligada? : " + smartTv.ligada);
		System.out.println("Canal atual? : " + smartTv.canal);
		System.out.println("Volume atual? : " + smartTv.volume);
		
		smartTv.mudarCanal(20);
		System.out.println("Novo Status --> Canal atual? : " + smartTv.canal);
		
		smartTv.ligar();
		System.out.println("Novo Status --> TV ligada? : " + smartTv.ligada);
		
		smartTv.desligar();
		System.out.println("Novo Status --> TV ligada? : " + smartTv.ligada);
	}

}
