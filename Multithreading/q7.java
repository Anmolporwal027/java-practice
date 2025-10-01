/*
When one thread calls join() on another thread, it means:
👉 "Wait here until that other thread finishes completely."

So:

If t1.join() is called inside the main thread → main will pause until t1 finishes.

After that, the main thread continues execution.
*/