/*  
Copyright [2013-2015] eBay Software Foundation
Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at
    http://www.apache.org/licenses/LICENSE-2.0
Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
 */
package io.parallec.core.exception;

// TODO: Auto-generated Javadoc
/**
 * The Class HttpRequestCreateException.
 */
public class HttpRequestCreateException extends RuntimeException {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 1L;

    /**
     * Instantiates a new http request create exception.
     *
     * @param error
     *            the error
     * @param t
     *            the t
     */
    public HttpRequestCreateException(String error, Exception t) {
        super(error, t);
    }

}
