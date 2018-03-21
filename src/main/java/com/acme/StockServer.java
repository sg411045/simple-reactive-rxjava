package com.acme;

import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;

import java.util.List;

/**
 * Created by sg on 20/03/18.
 */
public class StockServer {
  public static Observable<StockInfo> getFeed(List<String> symbols) {
    return Observable.create(subscriber -> emit(subscriber));
  }

  private static void emit(ObservableEmitter<StockInfo> subscriber) {
    System.out.println("Start emitting ... ");
  }
}
