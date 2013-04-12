package cn.blog.model.message;

/**
 * 用户之间的消息
 * @author xyz
 * @Date 2013-3-26
 */
public class Message {
	private int msgId;//系统自动编号，主键
	private String fromAccount;//发送消息的账号
	private String toAccount;//接受消息的账号
	private String content;//内容
	private int sign;//标识信息
	

	public int getMsgId() {
		return msgId;
	}
	public void setMsgId(int msgId) {
		this.msgId = msgId;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getFromAccount() {
		return fromAccount;
	}
	public void setFromAccount(String fromAccount) {
		this.fromAccount = fromAccount;
	}
	public String getToAccount() {
		return toAccount;
	}
	public void setToAccount(String toAccount) {
		this.toAccount = toAccount;
	}
	public int getSign() {
		return sign;
	}
	public void setSign(int sign) {
		this.sign = sign;
	}
	
	
}
