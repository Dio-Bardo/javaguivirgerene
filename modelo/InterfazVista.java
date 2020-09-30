package modelo;

public interface InterfazVista {
	void  setControlador(Controlador c);
	public  String  getFileName ();
	public  String  getText ();
	public  void  setText(String s);
	

	static  final  String  ABRIR="Abrir";
	static  final  String  ENCRYPT="encriptar";
	static  final  String  DECRYPT="desencriptar";
	static  final  String  GUARDAR="Guardar";
}
