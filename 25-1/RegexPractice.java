//本例需求：将口吃病人进行校正！
class RegexPractice 
{
	public static void main(String[] args) 
	{
		String str = "我...我我..我要..要要要...学学..学..编...编编编...程...程程..程";
		//(1)替换点
		String regex = "\\.{2,}";
		String result = str.replaceAll(regex,"");
		System.out.println(result);
		
		//(2)替换叠词
		String regex2 = "(.)\\1+"; //(.)第一位是任一字符，\\1表示再次重复 +表示重复一次以上
		String result2 = result.replaceAll(regex2,"$1");  //这里$1表示获取前一个规则的第一个字符
		System.out.println(result2);
	}
}
