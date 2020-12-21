package demo.com.lambda_s3;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.amazonaws.services.s3.event.S3EventNotification;

/**
 * Hello world!
 *
 */
public class App  implements RequestHandler<S3EventNotification , String>{
	
//	static final Logger log=LoggerFactory.getLogger(App.class);

	@Override
	public String handleRequest(S3EventNotification input, Context context) {
		System.out.println("S3 invoked"+ input.toJson());
		return null;
	}
	
}
