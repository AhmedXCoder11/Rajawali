package org.rajawali3d.loader;

public class AsyncLoaderTask implements Runnable {
    private String path;
    private ResourceCache cache;
    private ResourceCallback callback;
    private LoaderFunction loaderFunction;

    public interface LoaderFunction {
        Object load(String path) throws Exception;
    }

    public AsyncLoaderTask(String path, ResourceCache cache, ResourceCallback callback, LoaderFunction loaderFunction) {
        this.path = path;
        this.cache = cache;
        this.callback = callback;
        this.loaderFunction = loaderFunction;
    }

    @Override
    public void run() {
        try {
            Object resource = loaderFunction.load(path);
            cache.addResource(path, resource);
            callback.onLoaded(resource);
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
