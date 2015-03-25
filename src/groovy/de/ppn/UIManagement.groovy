package de.ppn

import com.vaadin.server.VaadinRequest
import com.vaadin.ui.*

class UIManagement extends UI {
        protected void init(VaadinRequest request) {
                setContent(new Label("Let's raid Lindisfarne!"))
        }
}
