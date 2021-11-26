public class DiadosNamorados extends CartaoWeb {
	
	public DiadosNamorados(String destinatario) {
		super(destinatario);
	}
	
	public String showMessage() {
		return "Feliz dia dos namorados, " + getDestinatario();
	}

}