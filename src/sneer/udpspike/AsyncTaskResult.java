
package sneer.udpspike;

public class AsyncTaskResult<T> {

	public final T result;

	public final Exception error;

	public AsyncTaskResult(final T result) {
		this( result, null );
	}

	public AsyncTaskResult(final Exception error) {
		this( null, error );
	}

	public boolean hasError() {
		return error != null;
	}

	private AsyncTaskResult(final T result, final Exception error) {
		this.result = result;
		this.error = error;
	}

}
