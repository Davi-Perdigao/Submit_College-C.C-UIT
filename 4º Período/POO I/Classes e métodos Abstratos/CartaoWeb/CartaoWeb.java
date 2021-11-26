public abstract class CartaoWeb {
	private String destinatario;
	
	public CartaoWeb(String destinatario) {
		setDestinatario(destinatario);
	}
	
	public abstract String showMessage();
	
	public String getDestinatario() {
		return destinatario;
	}
	
	public void setDestinatario(String destinatario) {
		this.destinatario = destinatario;
	}
}
