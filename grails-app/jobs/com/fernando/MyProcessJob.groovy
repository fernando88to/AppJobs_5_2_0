package com.fernando

class MyProcessJob {
    static triggers = {
        simple repeatInterval: 1000l // execute job once in 5 seconds
    }

    def execute() {
        // execute job
        println("Hello My Process")
    }
}