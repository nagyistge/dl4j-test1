/*
 *
 *  * Copyright 2015 Skymind,Inc.
 *  *
 *  *    Licensed under the Apache License, Version 2.0 (the "License");
 *  *    you may not use this file except in compliance with the License.
 *  *    You may obtain a copy of the License at
 *  *
 *  *        http://www.apache.org/licenses/LICENSE-2.0
 *  *
 *  *    Unless required by applicable law or agreed to in writing, software
 *  *    distributed under the License is distributed on an "AS IS" BASIS,
 *  *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  *    See the License for the specific language governing permissions and
 *  *    limitations under the License.
 *
 *
 */

package jcuda.runtime;

/**
 * Java port of a cudaExtent.
 *
 * @see JCuda#cudaMalloc3D
 * @see JCuda#cudaMemset3D
 * @see JCuda#cudaMalloc3DArray
 *
 */
public class cudaExtent
{
    /**
     * The width of this cudaExtent, in elements
     */
    public long width;

    /**
     * The height of this cudaExtent, in elements
     */
    public long height;

    /**
     * The depth of this cudaExtent
     */
    public long depth;

    /**
     * Creates a new cudaExtent with all-zero sizes
     */
    public cudaExtent()
    {
    }

    /**
     * Creates a new cudaExtent with the given sizes
     *
     * @param width The width of the cudaExtent
     * @param height The height of the cudaExtent
     * @param depth The depth of the cudaExtent
     */
    public cudaExtent(int width, int height, int depth)
    {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    /**
     * Creates a new cudaExtent with the given sizes
     *
     * @param width The width of the cudaExtent
     * @param height The height of the cudaExtent
     * @param depth The depth of the cudaExtent
     */
    public cudaExtent(long width, long height, long depth)
    {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    /**
     * Returns a String representation of this object.
     *
     * @return A String representation of this object.
     */
    @Override
    public String toString()
    {
        return "cudaExtent["+
            "width="+width+","+
            "height="+height+","+
            "depth="+depth+"]";
    }

}