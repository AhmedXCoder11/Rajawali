package org.rajawali3d.loader;

public class SmartLoader {
    private ResourceCache cache = new ResourceCache();

    public void loadResourceAsync(String path, ResourceCallback callback, AsyncLoaderTask.LoaderFunction loaderFunction) {
        if(cache.hasResource(path)) {
            callback.onLoaded(cache.getResource(path));
        } else {
            AsyncLoaderTask task = new AsyncLoaderTask(path, cache, callback, loaderFunction);
            new Thread(task).start();
        }
    }
}
