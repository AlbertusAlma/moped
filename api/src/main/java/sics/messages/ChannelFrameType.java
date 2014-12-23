package sics.messages;

// TODO: Auto-generated Javadoc
/**
 * The Enum MessageType.
 */
public class ChannelFrameType extends Enum {
	public static final byte START_SIGNAL = 1;
	public static final byte STOP_SIGNAL = 2;
	public static final byte INT_VALUE_TRANSMIT = 3;
	public static final byte STRING_VALUE_TRANSMIT = 4;
	public static final byte INT_VALUE_RQ = 5;
	public static final byte STRING_VALUE_RQ = 6;
	
	protected ChannelFrameType(byte enumValue) {
		super(enumValue);
		// TODO Auto-generated constructor stub
	}

}
