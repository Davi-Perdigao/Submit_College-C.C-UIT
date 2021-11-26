public class Natal extends CartaoWeb {
	public Natal(String destinatario) {
		super(destinatario);
	}
	
	public String showMessage() {
		return "Feliz natal, " + getDestinatario();
	}
}