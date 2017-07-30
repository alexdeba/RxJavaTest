package com.example.alex.rxjavatest

import io.reactivex.Observable
import java.util.*
import io.reactivex.ObservableOnSubscribe


var foo_bar = Observable.create(ObservableOnSubscribe<String> { observableEmitter ->
	observableEmitter.onNext("foo")
	observableEmitter.onNext("bar")
	observableEmitter.onComplete()
})

var hello_world = Observable.create(ObservableOnSubscribe<String> { sub ->
				sub.onNext("Hello, world!")
				sub.onComplete()
			})


var hello_world2 = Observable.just("Hello World!")

val one_to_five = Observable.fromIterable(Arrays.asList(1, 2, 3, 4, 5))

var one_to_ten = Observable.create(ObservableOnSubscribe<Int> { observableEmitter ->
	for(i in 1 .. 10)
		observableEmitter.onNext(i)

	observableEmitter.onComplete()
})

