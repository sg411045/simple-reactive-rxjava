package com.acme;

import io.reactivex.Observable;

import java.util.Arrays;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        final List<String> symbols = Arrays.asList("GOOG","AMZN", "AAPL", "MSFT");

        final Observable<StockInfo> feed = StockServer.getFeed(symbols);
        System.out.println( "Got observable" );
    }
}
