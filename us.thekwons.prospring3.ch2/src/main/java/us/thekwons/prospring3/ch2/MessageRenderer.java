package us.thekwons.prospring3.ch2;

public interface MessageRenderer {
	public void render();
	public void setMessageProvider(MessageProvider messageProvider);
	public MessageProvider getMessageProvider();
}
