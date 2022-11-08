import gi
import yes_window
import no_window
gi.require_version("Gtk","3.0")
from gi.repository import Gtk
class MainWindow(Gtk.Window):
    box1 = Gtk.Box(orientation=Gtk.Orientation.VERTICAL)
    label = Gtk.Label("Este es un mensaje poco importante")
    button = Gtk.Button(label="Ok")
    ##EJERCICIO 3
    box2 = Gtk.Box(orientation=Gtk.Orientation.HORIZONTAL)
    button1 = Gtk.Button(label="Si")
    button2 = Gtk.Button(label="No")
    def __init__(self):
        super().__init__(title="Alert")
        self.connect("destroy", Gtk.main_quit)
        self.button1.connect("clicked", self.on_button_clicked)
        self.add(self.box1)
        self.box1.pack_start(self.label, True, True, 0)
        self.box1.pack_start(self.box2,True, True, 0)
        self.box2.pack_start(self.button1, True, True, 0)
        self.box2.pack_start(self.button2, True, True, 0)
        self.button1.connect("clicked",self.on_button_clicked())
        self.button2.connect("clicked",self.on_button_clicked())
        ##self.add(self.box2)
        ##self.box.pack_start(self.button2, True, True, 0)
        ##self.box.pack_start(self.button3, True, True, 0)
    def on_button_clicked(self, widget):
        ##win=yes_window()
        ##win.showAll()
        pass
    def on_button_clicked(self, widget):
        ##win=yes_window()
        ##win.showAll()
        pass