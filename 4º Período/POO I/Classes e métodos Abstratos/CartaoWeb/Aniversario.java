public class Aniversario extends CartaoWeb {
	public Aniversario(String destinatario) {
		super(destinatario);
	}
	
	public String showMessage() {
		return "Feliz aniversário, " + getDestinatario();
	}
}