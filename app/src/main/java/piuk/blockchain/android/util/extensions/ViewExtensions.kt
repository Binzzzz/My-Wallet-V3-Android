@file:JvmName("ViewExtensions")

package piuk.blockchain.android.util.extensions

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText

/**
 * Sets the visibility of a [View] to [View.VISIBLE]
 */
fun View?.visible() {
    if (this != null) visibility = View.VISIBLE
}

/**
 * Sets the visibility of a [View] to [View.INVISIBLE]
 */
fun View?.invisible() {
    if (this != null) visibility = View.INVISIBLE
}

/**
 * Sets the visibility of a [View] to [View.GONE]
 */
fun View?.gone() {
    if (this != null) visibility = View.GONE
}

/**
 * Allows a [ViewGroup] to inflate itself without all of the unneeded ceremony of getting a
 * [LayoutInflater] and always passing the [ViewGroup] + false. True can optionally be passed if
 * needed.
 *
 * @param layoutId The layout ID as an [Int]
 * @return The inflated [View]
 */
fun ViewGroup.inflate(layoutId: Int, attachToRoot: Boolean = false): View {
    return LayoutInflater.from(context).inflate(layoutId, this, attachToRoot)
}

/**
 * Returns the current [String] entered into an [EditText]. Non-null, ie can return an empty String.
 */
fun EditText.getTextString(): String {
    return this.text.toString()
}