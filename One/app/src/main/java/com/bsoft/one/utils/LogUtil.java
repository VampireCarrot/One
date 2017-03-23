package com.bsoft.one.utils;

import android.text.TextUtils;
import android.util.Log;

/**
 * Log 日志工具类
 * @author weijiang.Zeng
 *
 */
public class LogUtil {

	//当前Debug模式
	public static boolean DE_BUG = true;
    private static final String AUTHOR ="HARLAN -->";
	public static void e(String tag, String text) {
		if (DE_BUG) {
			Log.e(tag, text);
		}
	}

	public static void d(String tag, String text) {
		if (DE_BUG) {
			Log.d(tag, text);
		}
	}

	public static void i(String tag, String text) {
		if (DE_BUG) {
			Log.i(tag, text);
		}
	}

	public static void w(String tag, String text) {
		if (DE_BUG) {
			Log.w(tag, text);
		}
	}
	
	public static void v(String tag, String text) {
		if (DE_BUG) {
			Log.v(tag, text);
		}
	}
	
	private static final String LOG_FORMAT = "%1$s\n%2$s";
	
	public static void d(String tag, Object... args) {
		log(Log.DEBUG, null, tag, args);
	}

	public static void i(String tag, Object... args) {
		log(Log.INFO, null, tag, args);
	}

	public static void w(String tag, Object... args) {
		log(Log.WARN, null, tag, args);
	}

	public static void e(Throwable ex) {
		log(Log.ERROR, ex, null);
	}

	public static void e(String tag, Object... args) {
		log(Log.ERROR, null, tag, args);
	}

	public static void e(Throwable ex, String tag, Object... args) {
		log(Log.ERROR, ex, tag, args);
	}

	private static void log(int priority, Throwable ex, String tag, Object... args) {
		
		if (LogUtil.DE_BUG == false) return;
		
		String log = "";
		if (ex == null) {
			if(args != null && args.length > 0){
				for(Object obj : args){
					log += String.valueOf(obj);
				}
			}
		} else {
			String logMessage = ex.getMessage();
			String logBody = Log.getStackTraceString(ex);
			log = String.format(LOG_FORMAT, logMessage, logBody);
		}
		Log.println(priority, tag, log);
	}
    /**
     * Json格式化输出
     * @param tag
     * @param message 内容
     * @param
     */
    public static void g(String tag, String message) {
        if (DE_BUG && !TextUtils.isEmpty(message)) {
            android.util.Log.i(tag, AUTHOR +"\n" + format(convertUnicode(message)));
        }
    }
	public static boolean isDebug() {
		return DE_BUG;
	}

	public static void setDebug(boolean isDebug) {
		LogUtil.DE_BUG = isDebug;
	}

    public static String convertUnicode(String ori) {
        char aChar;
        int len = ori.length();
        StringBuffer outBuffer = new StringBuffer(len);
        for (int x = 0; x < len; ) {
            aChar = ori.charAt(x++);
            if (aChar == '\\') {
                aChar = ori.charAt(x++);
                if (aChar == 'u') {
                    // Read the xxxx
                    int value = 0;
                    for (int i = 0; i < 4; i++) {
                        aChar = ori.charAt(x++);
                        switch (aChar) {
                            case '0':
                            case '1':
                            case '2':
                            case '3':
                            case '4':
                            case '5':
                            case '6':
                            case '7':
                            case '8':
                            case '9':
                                value = (value << 4) + aChar - '0';
                                break;
                            case 'a':
                            case 'b':
                            case 'c':
                            case 'd':
                            case 'e':
                            case 'f':
                                value = (value << 4) + 10 + aChar - 'a';
                                break;
                            case 'A':
                            case 'B':
                            case 'C':
                            case 'D':
                            case 'E':
                            case 'F':
                                value = (value << 4) + 10 + aChar - 'A';
                                break;
                            default:
                                throw new IllegalArgumentException(
                                        "Malformed   \\uxxxx   encoding.");
                        }
                    }
                    outBuffer.append((char) value);
                } else {
                    if (aChar == 't')
                        aChar = '\t';
                    else if (aChar == 'r')
                        aChar = '\r';
                    else if (aChar == 'n')
                        aChar = '\n';
                    else if (aChar == 'f')
                        aChar = '\f';
                    outBuffer.append(aChar);
                }
            } else
                outBuffer.append(aChar);

        }
        return outBuffer.toString();
    }
    public static String format(String jsonStr) {
        int level = 0;
        StringBuffer jsonForMatStr = new StringBuffer();
        for(int i=0;i<jsonStr.length();i++){
            char c = jsonStr.charAt(i);
            if(level>0&&'\n'==jsonForMatStr.charAt(jsonForMatStr.length()-1)){
                jsonForMatStr.append(getLevelStr(level));
            }
            switch (c) {
                case '{':
                case '[':
                    jsonForMatStr.append(c+"\n");
                    level++;
                    break;
                case ',':
                    jsonForMatStr.append(c+"\n");
                    break;
                case '}':
                case ']':
                    jsonForMatStr.append("\n");
                    level--;
                    jsonForMatStr.append(getLevelStr(level));
                    jsonForMatStr.append(c);
                    break;
                default:
                    jsonForMatStr.append(c);
                    break;
            }
        }

        return jsonForMatStr.toString();

    }

    private static String getLevelStr(int level){
        StringBuffer levelStr = new StringBuffer();
        for(int levelI = 0;levelI<level ; levelI++){
            levelStr.append("\t");
        }
        return levelStr.toString();
    }
}
