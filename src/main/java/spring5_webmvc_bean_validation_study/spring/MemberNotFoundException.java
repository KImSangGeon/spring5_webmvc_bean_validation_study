package spring5_webmvc_bean_validation_study.spring;

@SuppressWarnings("serial")
public class MemberNotFoundException extends RuntimeException {

	public MemberNotFoundException() {
	}

	public MemberNotFoundException(String message) {
		super("데이터 없음" );
	}

}
