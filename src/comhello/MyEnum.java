package comhello;

public enum MyEnum {
	    DIV("div"), DEPT("dept"), CLASS("class");

	    private final String val;

	    MyEnum(String val) {
	    this.val = val;
	    }

	    public String getVal() {
	    return val;
	    }
	


	MyEnum strTypeEnum = null;
	{

	// test if String str is compatible with the enum 
	// e.g. if you pass str = "div", it will return false. If you pass "DIV", it will return true.
	if( EnumUtils.isValidEnum(MyEnum.class, str) ){
	    strTypeEnum = MyEnum.valueOf(str);
	}

}
}