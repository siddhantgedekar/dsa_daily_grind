from mss import mss

# The simplest use, save a screenshot of the 1st monitor
with mss() as sct:
    try:
        sct.shot(output="shot1.png")
    except Exception as e:
        print(e, " --> ", e.details)