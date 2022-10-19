import gi
gi.require_version("Gtk","3.0")
from gi.repository import Gtk

class MainWindow(Gtk.Window):
    box = Gtk.Box(orientation=Gtk.Orientation.VERTICAL)
    label = Gtk.Label("Este es un mensaje poco importante")
    button = Gtk.Button(label="Realizar acción")
    ##Implementación del ejercicio 3 en el 2.
    def __init__(self):
        super().__init__(title="Alert")
        self.connect("destroy", Gtk.main_quit)
        self.button.connect("clicked", self.on_button_clicked)
        self.add(self.box)
        self.box.pack_start(self.label, True, True, 0)
        self.box.pack_start(self.button, True, True, 0)
        ##self.add(self.button)

    def on_button_clicked(self, widget):
        pass