package scriptTest;

import org.apache.commons.lang3.StringEscapeUtils;



public class HtmlEscapeTest {

	public static void main(String[] args) throws Exception {

		String results = StringEscapeUtils.escapeHtml4("<div>hii;</div>");
		System.out.println(results);

	}

}

