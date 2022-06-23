import java.util.concurrent.TimeUnit;

public class TokenBucketRateLimiter {
    private int refillRate;
    private int currentToken;
    private long deltaTime;
    private long lastTimeStamp;

    public TokenBucketRateLimiter() {
        this.refillRate = 10;
        this.currentToken = 10;
        this.deltaTime = 1000;
    }

    public TokenBucketRateLimiter(int bucketSize, int refillRate) {
        this.refillRate = refillRate;
        this.currentToken = bucketSize;
        this.deltaTime = 1000;
    }

    public boolean ProcessRequest() {
        Refill();

        if(currentToken > 0) {
            currentToken--;
            return true;
        }

        return false;
    }

    private void Refill() {
        long currentTimeStamp = System.currentTimeMillis();
        if(deltaTime < currentTimeStamp-lastTimeStamp) {
            currentToken = refillRate;
        }
        lastTimeStamp = currentTimeStamp;
    }
}