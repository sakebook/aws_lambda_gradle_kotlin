package com.sakebook.sample.lambda_test

import com.amazonaws.services.lambda.runtime.Context
import com.amazonaws.services.lambda.runtime.LambdaLogger

/**
 * Created by sakemotoshinya on 16/11/25.
 */
public class App {
    public fun handler(count: Int, context: Context): String {
        val lambdaLogger = context.getLogger()
        lambdaLogger.log("count = " + count)
        return "${count * 3}"
    }
}
