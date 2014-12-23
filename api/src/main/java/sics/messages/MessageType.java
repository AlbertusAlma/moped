package sics.messages;

import java.io.Serializable;

// TODO: Auto-generated Javadoc
/**
 * The Enum MessageType.
 */
public class MessageType extends Enum {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public static final byte INIT = 0;
	public static final byte INSTALL = 1;
	public static final byte UNINSTALL = 2;
	public static final byte INSTALL_ACK = 3;
	public static final byte UNINSTALL_ACK = 4;
	public static final byte RESTORE = 5;
	public static final byte PLUGIN_MESSAGE = 6;
	public static final byte PORT_LINK_CONTEXT_MESSAGE = 7;
	public static final byte PORT_LINK_ACK_MESSAGE = 8;
	public static final byte RESTORE_ACK = 9;
	public static final byte LOAD = 10;
	public static final byte LOAD_ACK = 11;
	public static final byte PUBLISH = 12;
	public static final byte SUBSCRIBE = 13;
	public static final byte REQUEST_ID = 14;
	public static final byte REQUEST_ID_ACK = 15;
	
	protected MessageType(byte enumValue) {
		super(enumValue);
		// TODO Auto-generated constructor stub
	}

}
